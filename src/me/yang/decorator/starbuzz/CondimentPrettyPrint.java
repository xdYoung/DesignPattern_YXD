package me.yang.decorator.starbuzz;

import java.util.ArrayList;
import java.util.HashMap;

public class CondimentPrettyPrint extends CondimentDecorator{
    Beverage beverage;

    public CondimentPrettyPrint(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost();
    }

    @Override
    public ArrayList<String> getDescription() {
        beverage.list = beverage.getDescription();
//        System.out.println(beverage.list);
        ArrayList<String> newlist = new ArrayList<>();

        HashMap<String, Integer> hmap = new HashMap<>();

        for (int i = 0; i < beverage.list.size(); i++) {
            if(!newlist.contains(beverage.list.get(i))){
                newlist.add(beverage.list.get(i));
                hmap.put(beverage.list.get(i), 1);
            }else{
                int count = hmap.get(beverage.list.get(i));
                count += 1;
                hmap.replace(beverage.list.get(i), count);
            }
        }

        for (String k: hmap.keySet()) {
            if(hmap.get(k) == 1){}
            else if(hmap.get(k) == 2){
                newlist.set(newlist.indexOf(k),
                        newlist.get(newlist.indexOf(k)) + " + double ");
            }
            else if(hmap.get(k) == 3){
                newlist.set(newlist.indexOf(k),
                        newlist.get(newlist.indexOf(k)) + " + Three ");
            }
            else{
               newlist.set(newlist.indexOf(k),
                        newlist.get(newlist.indexOf(k)) + " + 多份 ");
                }
        }

        return newlist;
    }
}
