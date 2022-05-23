package com.digianalytix.mobile_de.repository;

import com.digianalytix.mobile_de.domain.JobRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface JobRecordRepository extends JpaRepository<JobRecord, Long> {

    @Transactional
    default void deleteOldRecords() {
        deleteRecordsOlderThan(LocalDateTime.now().minusDays(60));
    }

    @Modifying
    @Query("delete from JobRecord where executedAt< :fromDate")
    void deleteRecordsOlderThan(@Param("fromDate") LocalDateTime fromDate);

    @Query("select max (executedAt) from JobRecord where status = com.digianalytix.mobile_de.domain.JobStatus.SUCCESS")
    Optional<LocalDateTime> getLastSuccessfulRun();

    @Query("from JobRecord order by executedAt desc ")
    List<JobRecord> getRecords();
}
