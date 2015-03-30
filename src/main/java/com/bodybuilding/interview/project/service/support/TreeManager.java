/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bodybuilding.interview.project.service.support;

import com.bodybuilding.interview.project.web.json.Navigation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zula.weynishet
 */
public class TreeManager {
 public Navigation getNode(String id,Navigation parent){
     
    Navigation parentItemToSelectedId=new Navigation();    
    Navigation ItemToAdd=new Navigation();
    Tree root=new Tree(parentItemToSelectedId);
    List<Navigation> navigations=new ArrayList<Navigation>();
    for(int i=0;i<parent.getChildren().size();i++){
        if(i==0){
          ItemToAdd.setChildren(new ArrayList());
          navigations.add(ItemToAdd);
        }
      if(parent.getChildren().get(i).getId().equals(id)) {
          
      } 
    } 
 return null; 
}
}

