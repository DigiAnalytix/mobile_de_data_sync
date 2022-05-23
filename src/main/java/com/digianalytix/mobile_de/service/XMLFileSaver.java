package com.digianalytix.mobile_de.service;

import com.digianalytix.mobile_de.ApplicationException;
import com.digianalytix.mobile_de.xml.search.SearchResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Service
@Slf4j
public class XMLFileSaver {
    private static final String XML_FILE_NAME = "results.xml";
    private final Marshaller marshaller;

    public XMLFileSaver() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(SearchResult.class);
        this.marshaller = jaxbContext.createMarshaller();
    }

    public static String getFilePath() {
        return Paths.get(System.getProperty("user.dir")).normalize().getParent().toAbsolutePath().resolve(XML_FILE_NAME)
                .toString();
    }

    public void writeResultToXml(SearchResult searchResult) throws ApplicationException {
        StringWriter sw = new StringWriter();
        try {
            marshaller.marshal(searchResult, sw);
            Files.writeString(Paths.get(getFilePath()),
                    sw.toString(),
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (JAXBException e) {
            log.error("Error while converting xml object to String", e);
            throw new ApplicationException("Error while converting object to String", e);
        } catch (IOException e) {
            log.error("Error while writing xml String to file", e);
            throw new ApplicationException("Error while writing xml String to file", e);
        }

    }

}
