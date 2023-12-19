package org.example.lab8;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static org.example.lab8.Events.getNumOfRecords;


class task3 {
    public static void main(String[] args) throws IOException {
        Events events = new Events();
        events.generateEventsFile("eventsOne", getNumOfRecords());
        events.readEventsFile("eventsOne");
    }
}

class Events {
    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final int NUM_OF_RECORDS = 1000000;

    public static int getNumOfRecords() {
        return NUM_OF_RECORDS;
    }

    public void generateEventsFile(String fileName, int numOfRecords) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        Random random = new Random();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (int i = 0; i < numOfRecords; i++) {
            String timestamp = dateFormat.format(new Date(System.currentTimeMillis() - random.nextInt(1000000000)));
            String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];
            int userID = random.nextInt(1000);

            writer.write(timestamp + ", Event Type: " + eventType + ", ID: " + userID + "\n");
        }
        System.out.println("Event log generation is done");
        writer.close();
    }

    public void readEventsFile(String fileName) throws IOException {
        int iterationCounter = 0;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String tempLine;
        while ((tempLine = reader.readLine()) != null && iterationCounter < 5) {
            System.out.println(tempLine);
            iterationCounter++;
        }
        System.out.println("Event log reading is done");
        reader.close();
    }
}
