/*
 * Copyright (C) 2011-2023, Datalogics, Inc. All rights reserved.
 * 
 */

package com.datalogics.pdfl.JavaViewer.Views.Actions;

import java.awt.event.ActionEvent;

import com.datalogics.pdfl.JavaViewer.Document.Command.DeleteAnnotationCommand;
import com.datalogics.pdfl.JavaViewer.Document.Command.DocumentCommand;

public class DeleteAnnotationAction extends SimpleAction {
    public void actionPerformed(ActionEvent e) {
        executeMainCommand(null);
    }

    @Override
    protected Class<? extends DocumentCommand> getMainCommand() {
        return DeleteAnnotationCommand.class;
    }
}
