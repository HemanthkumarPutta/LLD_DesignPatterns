package com.example.lowleveldesign_patterns.factory.refactoring_guru.Button;

public class HTMLButton implements Button {
    @Override
    public void OnClick() {
        System.out.println("HTML Button Clicked");
    }

    @Override
    public void render() {
        System.out.println("HTML Button is rendering..");
    }
}
