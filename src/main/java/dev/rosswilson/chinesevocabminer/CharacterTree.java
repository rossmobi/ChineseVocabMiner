package dev.rosswilson.chinesevocabminer;

import lombok.*;

import java.util.*;

public class CharacterTree<T, U> {
    @Getter
    private Node<T, U> root;

    public CharacterTree(T rootData) {
        root = new Node<T, U>();
        root.id = rootData;
        root.children = new ArrayList<Node<T, U>>();
    }

    @Getter @Setter
    public static class Node<T, U> {
        private T id;
        private U data;
        private Node<T, U> parent;
        private List<Node<T, U>> children = new ArrayList<>();

        public void addChild(Node<T, U> child) {
            children.add(child);
        }

        public Node<T, U> getChild(T id) {
            for (Node<T, U> child : children) {
                if (id.equals(child.id)) return child;
            }
            return null;
        }


    }
}