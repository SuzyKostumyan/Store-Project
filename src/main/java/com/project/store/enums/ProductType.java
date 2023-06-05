package com.project.store.enums;

/**
 *
 * @author admin
 */
public enum ProductType {
    DESKTOPCOMPUTER("DesktopComputer"),
    LAPTOP("Laptop"),
    MONITOR("Monitor"),
    HARDDISK("HardDisk");

    private String typeName;

    ProductType(String name) {
        this.typeName = name;
    }

    public String getTypeName() {
        return typeName;
    }
}
