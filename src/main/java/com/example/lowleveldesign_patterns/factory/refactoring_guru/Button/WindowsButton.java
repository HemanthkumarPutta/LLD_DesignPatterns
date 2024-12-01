package com.example.lowleveldesign_patterns.factory.refactoring_guru.Button;

public class WindowsButton implements Button{
    @Override
    public void OnClick() {
        System.out.println("Windows Button Clicked");
    }

    @Override
    public void render() {
        System.out.println("Windows Button is Rendering..");
    }
}
