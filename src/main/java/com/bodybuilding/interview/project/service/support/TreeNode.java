/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bodybuilding.interview.project.service.support;

import java.util.List;

/**
 *
 * @author zula.weynishet
 */

 public class TreeNode<Navigation> {    
  Navigation data;  
  List<TreeNode> childern;  
  TreeNode(Navigation data)  
  {  
   this.data=data;  
  } 

    public Navigation getData() {
        return data;
    }

    public void setData(Navigation data) {
        this.data = data;
    }

    public List<TreeNode> getChildern() {
        return childern;
    }

    public void setChildern(List<TreeNode> childern) {
        this.childern = childern;
    }
  
}
