package com.example.lowleveldesign_patterns.factory.refactoring_guru;


import com.example.lowleveldesign_patterns.factory.refactoring_guru.Button.Button;
import com.example.lowleveldesign_patterns.factory.refactoring_guru.Dialog.HTMLDialog;
import com.example.lowleveldesign_patterns.factory.refactoring_guru.Dialog.WindowsDialog;

public class Client {
    public static void main(String[] args){
        HTMLDialog htmlDialog = new HTMLDialog();
        Button HtmlButton = htmlDialog.createButton();
        HtmlButton.OnClick();
        HtmlButton.render();


        WindowsDialog windowsDialog = new WindowsDialog();
        Button windowsButton = windowsDialog.createButton();
        windowsButton.OnClick();
        windowsButton.render();
    }
}
