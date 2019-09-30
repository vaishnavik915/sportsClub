package com.rsa.sportsClub.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Document(collection = "slot")
public class Slot {
    @Id
    private String slotId;
    private Game game;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Slot(Game game, LocalDateTime startTime, LocalDateTime endTime) {
        this.game = game;
        this.startTime = startTime;
        this.endTime = endTime;

    }

    public Slot() { }

    public String getSlotId() {
        return slotId;
    }

   public void setSlotId(String slotId) {
        this.slotId = slotId;

    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "slotId='" + slotId + '\'' +
                ", game=" + game +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
