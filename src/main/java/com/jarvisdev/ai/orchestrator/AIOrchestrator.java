package com.jarvisdev.ai.orchestrator;

import com.jarvisdev.ai.Command;
import com.jarvisdev.ai.CommandEngine;
import com.jarvisdev.ai.IntentRecognizer;

public class AIOrchestrator {

    private final IntentRecognizer recognizer;
    private final CommandEngine engine;

    public AIOrchestrator() {

        recognizer = new IntentRecognizer();
        engine = new CommandEngine();
    }

    public void process(String input) {

        Command command =
                recognizer.recognize(input);

        engine.execute(command);
    }
}