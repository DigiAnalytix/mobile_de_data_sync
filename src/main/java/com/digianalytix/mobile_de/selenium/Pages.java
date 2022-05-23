package com.digianalytix.mobile_de.selenium;

public enum Pages {
    LOGIN_PAGE("/wp-login.php"),
    HOME_PAGE("/wp-admin/"),
    IMPORT_PAGE("/wp-admin/admin.php?page=pmxi-admin-import");
    public final String path;

    private Pages(String path) {
        this.path = path;
    }
}
