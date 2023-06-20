import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Participant {
    String name;
    String choice;

    Participant(String name, String choice) {
        this.name = name;
        this.choice = choice;
    }

    String getName() {
        return name;
    }

    String getChoice() {
        return choice;
    }
}

public class AmigosHabay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Participant> participants = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("FIM")) {
                break;
            }

            String[] parts = input.split(" ");
            String name = parts[0];
            String choice = parts[1];
            participants.add(new Participant(name, choice));
        }

        Collections.sort(participants, new Comparator<Participant>() {
            @Override
            public int compare(Participant p1, Participant p2) {
                if (p1.getChoice().equals(p2.getChoice())) {
                    return p1.getName().compareTo(p2.getName());
                } else {
                    return p1.getChoice().compareTo(p2.getChoice());
                }
            }
        });

        String winner = getWinner(participants);
        printParticipants(participants);
        System.out.println();
        System.out.println("Vencedor: " + winner);
    }

    private static String getWinner(List<Participant> participants) {
        int maxLetters = 0;
        String winner = "";

        for (Participant participant : participants) {
            int nameLength = participant.getName().length();
            if (nameLength > maxLetters && participant.getChoice().equals("YES")) {
                maxLetters = nameLength;
                winner = participant.getName();
            }
        }

        return winner;
    }

    private static void printParticipants(List<Participant> participants) {
        for (Participant participant : participants) {
            System.out.println(participant.getName());
        }
    }
}
