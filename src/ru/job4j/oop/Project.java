package ru.job4j.oop;

import java.time.LocalDate;

public class Project {
    private String name;
    private int id;
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private boolean finished;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
