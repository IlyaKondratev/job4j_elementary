package ru.job4j.oop;

import java.time.LocalDate;

public class Engineer extends Profession {

    private Project currentProject;

    public void startProject(TechDesign techDesign) {
        currentProject = new Project();
        currentProject.setDateBegin(LocalDate.now());
    }

    public Project closeProject(TechDesign techDesign) {
        currentProject.setDateEnd(LocalDate.now());
        currentProject.setFinished(true);
        return currentProject;
    }

}
