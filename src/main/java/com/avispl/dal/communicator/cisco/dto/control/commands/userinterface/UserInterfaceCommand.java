/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/***
 * User interface command is a template for any command that can be performed for user interface
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserInterfaceCommand {
    /***
     * Message is one of the entities that user interface actions can be performed towards
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */

    public static class Message {
        /***
         * Text line is one of the message actions that can be performed
         *
         * @author Maksym.Rossiitsev / Symphony Dev Team<br>
         * Created on Apr 26, 2021
         * @since 1.0
         */

        public static class TextLine {
            /***
             * Display is the specific action that can be performed towards the Message
             *
             * @author Maksym.Rossiitsev / Symphony Dev Team<br>
             * Created on Apr 26, 2021
             * @since 1.0
             */

            public static class Display {
                @JacksonXmlProperty(isAttribute = true)
                private final String command = "True";
                @JacksonXmlProperty(localName="Text")
                private ValueSpaceRefHolder text;
                @JacksonXmlProperty(localName="Duration")
                private ValueSpaceRefHolder duration;

                /**
                 * Default constructor
                 * */
                public Display() {}
                /**
                 * Instantiate Display command with given text and on screen duration
                 *
                 * @param duration message duration in seconds
                 * @param text to show on the screen
                 * */
                public Display(String text, Integer duration) {
                    this.text = new ValueSpaceRefHolder(text);
                    this.duration = new ValueSpaceRefHolder(duration);
                }

                /**
                 * Retrieves {@code {@link #text}}
                 *
                 * @return value of {@link #text}
                 */
                public ValueSpaceRefHolder getText() {
                    return text;
                }

                /**
                 * Sets {@code text}
                 *
                 * @param text the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
                 */
                public void setText(ValueSpaceRefHolder text) {
                    this.text = text;
                }

                /**
                 * Retrieves {@code {@link #duration}}
                 *
                 * @return value of {@link #duration}
                 */
                public ValueSpaceRefHolder getDuration() {
                    return duration;
                }

                /**
                 * Sets {@code duration}
                 *
                 * @param duration the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
                 */
                public void setDuration(ValueSpaceRefHolder duration) {
                    this.duration = duration;
                }

                /**
                 * Retrieves {@code {@link #command}}
                 *
                 * @return value of {@link #command}
                 */
                public String getCommand() {
                    return command;
                }
            }
            @JacksonXmlProperty(localName="Display")
            private Display display;

            /**
             * Retrieves {@code {@link #display}}
             *
             * @return value of {@link #display}
             */
            public Display getDisplay() {
                return display;
            }

            /**
             * Sets {@code display}
             *
             * @param display the {@code com.avispl.dal.communicator.cisco.dto.control.commands.userinterface.UserInterfaceCommand.Message.TextLine.Display} field
             */
            public void setDisplay(Display display) {
                this.display = display;
            }
        }
        @JacksonXmlProperty(localName="TextLine")
        private TextLine textLine;

        /**
         * Default constructor
         * */
        public Message () {}
        /**
         * Instantiate message with given text and duration
         *
         * @param text to display
         * @param duration in seconds
         * */
        public Message (String text, Integer duration) {
            textLine = new TextLine();
            textLine.setDisplay(new TextLine.Display(text, duration));
        }

        /**
         * Retrieves {@code {@link #textLine}}
         *
         * @return value of {@link #textLine}
         */
        public TextLine getTextLine() {
            return textLine;
        }

        /**
         * Sets {@code textLine}
         *
         * @param textLine the {@code com.avispl.dal.communicator.cisco.dto.control.commands.userinterface.UserInterfaceCommand.Message.TextLine} field
         */
        public void setTextLine(TextLine textLine) {
            this.textLine = textLine;
        }
    }

    @JacksonXmlProperty(localName="Message")
    private Message message;

    /**
     * Retrieves {@code {@link #message}}
     *
     * @return value of {@link #message}
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Sets {@code message}
     *
     * @param message the {@code com.avispl.dal.communicator.cisco.dto.control.commands.userinterface.UserInterfaceCommand.Message} field
     */
    public void setMessage(Message message) {
        this.message = message;
    }
}
