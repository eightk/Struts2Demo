/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strutsDemo.action;

import com.strutsDemo.service.TutorialFinderService;

/**
 *
 * @author huico
 */
public class TutorialAction {

    public String getBestTutorialSite() {
        return bestTutorialSite;
    }

    public void setBestTutorialSite(String bestTutorialSite) {
        this.bestTutorialSite = bestTutorialSite;
    }      

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }   
    
    public String execute() {
        TutorialFinderService tutorialFinder = new TutorialFinderService();
        setBestTutorialSite(tutorialFinder.getBestTutorialSite(getLanguage()));
        
        return "success";
    }
    
    private String bestTutorialSite = "";
    private String language = "";
}
