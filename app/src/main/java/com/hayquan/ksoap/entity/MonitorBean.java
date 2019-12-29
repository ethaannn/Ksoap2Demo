package com.hayquan.ksoap.entity;

import java.io.Serializable;

/**
 * Created by DongBang on 2016/5/8.
 */
public class MonitorBean implements Serializable {


    private float proportion;
    private int id;
    private int parentId;
    private int areaStatus;
    private String monitor;
    private String areaName;
    private String location;
    private int areaClassify;
    private int roleLevel;
    private double longitude;
    private int leaf;
    private double latitude;

    public float getProportion() {
        return proportion;
    }

    public void setProportion(float proportion) {
        this.proportion = proportion;
    }

    public void setProportion(int proportion) {
        this.proportion = proportion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getAreaStatus() {
        return areaStatus;
    }

    public void setAreaStatus(int areaStatus) {
        this.areaStatus = areaStatus;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAreaClassify() {
        return areaClassify;
    }

    public void setAreaClassify(int areaClassify) {
        this.areaClassify = areaClassify;
    }

    public int getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getLeaf() {
        return leaf;
    }

    public void setLeaf(int leaf) {
        this.leaf = leaf;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
