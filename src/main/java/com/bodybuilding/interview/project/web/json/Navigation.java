/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bodybuilding.interview.project.web.json;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author zula.weynishet
 */
public class Navigation {
  private String id;
  private String name;
  private String url;
  private List<Navigation> children=new LinkedList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Navigation> getChildren() {
        return children;
    }

    public void setChildren(List<Navigation> children) {
        this.children = children;
    }
    public boolean hasChild() 
        {           
            return children.size()>0 ? true:false;
        }
    @Override
    public String toString() {
        return "ID : "+this.id
               + "Name : " +this.name
               +"URL : "+this.url
               +"Number of Childeren : "+children.size(); //To change body of generated methods, choose Tools | Templates.
    }
  
}
