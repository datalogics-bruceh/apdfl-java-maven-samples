/*
 * Copyright (C) 2011-2023, Datalogics, Inc. All rights reserved.
 * 
 */

package com.datalogics.pdfl.JavaViewer.Views.Actions;

import java.awt.event.ActionEvent;

import com.datalogics.pdfl.JavaViewer.Document.JavaDocument;
import com.datalogics.pdfl.JavaViewer.Document.Command.CommandType;
import com.datalogics.pdfl.JavaViewer.Document.Command.CreateAnnotationCommand;
import com.datalogics.pdfl.JavaViewer.Document.Command.DocumentCommand;

public class CreateAnnotationAction extends SimpleAction {

    public CreateAnnotationAction(String annotationSubType) {
        this.annotationSubType = annotationSubType;
    }

    @Override
    public boolean isPermitted() {
        return JavaDocument.isCommandPermitted(getApplication().getActiveDocument(), CommandType.VIEW);
    }

    public void actionPerformed(ActionEvent e) {
        executeMainCommand(new InvokeParams[] { new InvokeParams(String.class, this.annotationSubType) });
    }

    @Override
    protected Class<? extends DocumentCommand> getMainCommand() {
        return CreateAnnotationCommand.class;
    }

    public String getSubType() {
        return annotationSubType;
    }

    private String annotationSubType;
}
