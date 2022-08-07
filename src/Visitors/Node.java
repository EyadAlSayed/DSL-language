package Visitors;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class Node {

    Node father;
    Object self;
    ArrayList<Node> sons = new ArrayList<>();
    ArrayList<Pair<String,String>> variables = new ArrayList<>();

    public ArrayList<Pair<String, String>> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Pair<String, String>> variables) {
        this.variables = variables;
    }

    public Node(Node father, Object self) {
        this.father = father;
        this.self = self;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public Object getSelf() {
        return self;
    }

    public void setSelf(Object self) {
        this.self = self;
    }

    public ArrayList<Node> getSons() {
        return sons;
    }

    public void setSons(ArrayList<Node> sons) {
        this.sons = sons;
    }
}
