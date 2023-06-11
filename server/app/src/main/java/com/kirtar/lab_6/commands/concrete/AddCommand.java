package com.kirtar.lab_6.commands.concrete;

import com.kirtar.lab_6.commands.Command;
import com.kirtar.lab_6.commands.Receiver;
import com.kirtar.lab_6.models.Flat;
import com.kirtar.lab_6.messages.ServerResponse;

/**
 * add a new element to the collection
 */

public class AddCommand implements Command{

    private Receiver receiver;
    private Flat element;

    public AddCommand(Receiver receiver)
    {
        this.receiver = receiver;
    }
    public AddCommand(Receiver receiver, Flat element)
    {
        this.receiver = receiver;
        this.element = element;
    }

    @Override
    public ServerResponse execute()
    {
        return receiver.add(element);
    }

    public void setArg(Object element){
        this.element = (Flat) element;
    }
}