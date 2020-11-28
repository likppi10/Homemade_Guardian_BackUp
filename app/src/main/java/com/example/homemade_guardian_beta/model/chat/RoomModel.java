package com.example.homemade_guardian_beta.model.chat;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RoomModel {
    private Date RoomModel_DateOfManufacture;
    private String RoomModel_FileName;
    private String RoomModel_FileSize;
    private String RoomModel_ImageCount;
    private String RoomModel_Message;
    private String RoomModel_PostUid;
    private String RoomModel_Title;
    private String RoomModel_UserUid;
    private String RoomModel_MessageType;
    private Map<String, Integer> RoomModel_USERS;
    private Map<String, Integer> RoomModel_USER_OUT;

    public RoomModel(){}

    public RoomModel(Date RoomModel_DateOfManufacture, String RoomModel_FileName, String RoomModel_FileSize, String RoomModel_ImageCount, String RoomModel_Message, String RoomModel_PostUid, String RoomModel_Title, String RoomModel_UserUid, String RoomModel_MessageType, Map<String, Integer> RoomModel_USERS, Map<String, Integer> RoomModel_USER_OUT){
        this.RoomModel_DateOfManufacture = RoomModel_DateOfManufacture;
        this.RoomModel_FileName = RoomModel_FileName;
        this.RoomModel_FileSize = RoomModel_FileSize;
        this.RoomModel_ImageCount = RoomModel_ImageCount;
        this.RoomModel_Message = RoomModel_Message;
        this.RoomModel_PostUid = RoomModel_PostUid;
        this.RoomModel_Title = RoomModel_Title;
        this.RoomModel_UserUid = RoomModel_UserUid;
        this.RoomModel_MessageType = RoomModel_MessageType;
        this.RoomModel_USERS = RoomModel_USERS;
        this.RoomModel_USER_OUT = RoomModel_USER_OUT;
    }

    public Map<String, Object> getRoomInfo(){
        Map<String, Object> docData = new HashMap<>();
        docData.put("RoomModel_DateOfManufacture", RoomModel_DateOfManufacture);
        docData.put("RoomModel_FileName", RoomModel_FileName);
        docData.put("RoomModel_FileSize", RoomModel_FileSize);
        docData.put("RoomModel_ImageCount", RoomModel_ImageCount);
        docData.put("RoomModel_Message", RoomModel_Message);
        docData.put("RoomModel_PostUid", RoomModel_PostUid);
        docData.put("RoomModel_Title", RoomModel_Title);
        docData.put("RoomModel_UserUid", RoomModel_UserUid);
        docData.put("RoomModel_MessageType", RoomModel_MessageType);
        docData.put("RoomModel_USERS", RoomModel_USERS);
        docData.put("RoomModel_USER_OUT", RoomModel_USER_OUT);
        return  docData;
    }
    public Date getRoomModel_DateOfManufacture() {
        return RoomModel_DateOfManufacture;
    }

    public void setRoomModel_DateOfManufacture(Date roomModel_DateOfManufacture) {
        RoomModel_DateOfManufacture = roomModel_DateOfManufacture;
    }

    public String getRoomModel_FileName() {
        return RoomModel_FileName;
    }

    public void setRoomModel_FileName(String roomModel_FileName) {
        RoomModel_FileName = roomModel_FileName;
    }

    public String getRoomModel_FileSize() {
        return RoomModel_FileSize;
    }

    public void setRoomModel_FileSize(String roomModel_FileSize) {
        RoomModel_FileSize = roomModel_FileSize;
    }

    public String getRoomModel_ImageCount() {
        return RoomModel_ImageCount;
    }

    public void setRoomModel_ImageCount(String roomModel_ImageCount) {
        RoomModel_ImageCount = roomModel_ImageCount;
    }

    public String getRoomModel_Message() {
        return RoomModel_Message;
    }

    public void setRoomModel_Message(String roomModel_Message) {
        RoomModel_Message = roomModel_Message;
    }

    public String getRoomModel_PostUid() {
        return RoomModel_PostUid;
    }

    public void setRoomModel_PostUid(String roomModel_PostUid) {
        RoomModel_PostUid = roomModel_PostUid;
    }

    public String getRoomModel_Title() {
        return RoomModel_Title;
    }

    public void setRoomModel_Title(String roomModel_Title) {
        RoomModel_Title = roomModel_Title;
    }

    public String getRoomModel_UserUid() {
        return RoomModel_UserUid;
    }

    public void setRoomModel_UserUid(String roomModel_UserUid) {
        RoomModel_UserUid = roomModel_UserUid;
    }

    public String getRoomModel_MessageType() {
        return RoomModel_MessageType;
    }

    public void setRoomModel_MessageType(String roomModel_MessageType) {
        RoomModel_MessageType = roomModel_MessageType;
    }

    public Map<String, Integer> getRoomModel_USERS() {
        return RoomModel_USERS;
    }

    public void setRoomModel_USERS(Map<String, Integer> roomModel_USERS) {
        this.RoomModel_USERS = roomModel_USERS;
    }

    public Map<String, Integer> getRoomModel_USER_OUT() {
        return RoomModel_USER_OUT;
    }

    public void setRoomModel_USER_OUT(Map<String, Integer> roomModel_USER_OUT) {
        this.RoomModel_USER_OUT = roomModel_USER_OUT;
    }
}