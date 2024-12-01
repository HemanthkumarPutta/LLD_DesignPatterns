package com.example.lowleveldesign_patterns.factory.refactoring_guru.Dialog;

import com.example.lowleveldesign_patterns.factory.refactoring_guru.Button.Button;
import com.example.lowleveldesign_patterns.factory.refactoring_guru.Button.WindowsButton;

public class WindowsDialog extends ButtonDialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
