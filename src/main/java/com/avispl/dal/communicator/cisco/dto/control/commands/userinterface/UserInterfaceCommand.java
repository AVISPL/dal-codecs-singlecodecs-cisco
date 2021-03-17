/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceCommand {
    @XmlAccessorType(XmlAccessType.NONE)
    public static class Message {
        @XmlAccessorType(XmlAccessType.NONE)
        public static class TextLine {
            @XmlAccessorType(XmlAccessType.NONE)
            public static class Display {
                @XmlAttribute
                private final String command = "True";
                @XmlElement(name = "Text")
                private ValueSpaceRefHolder text;
                @XmlElement(name = "Duration")
                private ValueSpaceRefHolder duration;

                public Display() {}
                public Display(String text, Integer duration) {
                    this.text = new ValueSpaceRefHolder(text);
                    this.duration = new ValueSpaceRefHolder(duration);
                }
                public ValueSpaceRefHolder getText() {
                    return text;
                }

                public ValueSpaceRefHolder getDuration() {
                    return duration;
                }

                public void setText(ValueSpaceRefHolder text) { this.text = text; }

                public void setDuration(ValueSpaceRefHolder duration) { this.duration = duration; }

                public String getCommand() { return command; }
            }
            @XmlElement(name = "Display")
            private Display display;

            public Display getDisplay() {
                return display;
            }

            public void setDisplay(Display display) {
                this.display = display;
            }
        }
        @XmlElement(name = "TextLine")
        private TextLine textLine;

        public Message () {}
        public Message (String text, Integer duration) {
            textLine = new TextLine();
            textLine.setDisplay(new TextLine.Display(text, duration));
        }

        public TextLine getTextLine() {
            return textLine;
        }

        public void setTextLine(TextLine textLine) {
            this.textLine = textLine;
        }
    }

    @XmlElement(name = "Message")
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
