package tictactoe;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created by ubu on 29/11/16.
 */
public class Grid {
    private Character[][] boxes;

    public Grid(Character[][] boxes) {
        this.boxes = boxes;
    }

    public Character[] getBoxes() {
        return Arrays.stream(boxes)
                .flatMap(Arrays::stream)
                .toArray(Character[]::new);
    }

    public Character[] getLine(int lineNumber) {
        return boxes[lineNumber - 1];
    }

    public Character[] getColumn(int columnNumber) {
        return Arrays.stream(boxes)
                .map(characters -> characters[columnNumber - 1])
                .toArray(Character[]::new);
    }

    public Character[] getDiagonal() {
        AtomicInteger temp = new AtomicInteger();
        return Arrays.stream(boxes)
                .map(characters -> characters[temp.getAndIncrement()])
                .toArray(Character[]::new);
    }

    public Character[] getAntiDiagonal() {
        AtomicInteger temp = new AtomicInteger(2);
        return Arrays.stream(boxes)
                .map(characters -> characters[temp.getAndDecrement()])
                .toArray(Character[]::new);
    }

    public Character isWon(Character[] line) {
        if(line[0] == line[1] && line[0] == line[2]) {
            return line[0];
        }
        return null;
    }

    public Character isWonBy() {
        return Arrays.stream(getWiningChecks())
                .map(this::isWon)
                .reduce(null, (o, r) -> {
                    if (o == null) {
                        return r;
                    }
                    return o;
                });
    }

    private Character[][] getWiningChecks() {
        return new Character[][] {
                this.getLine(1),
                this.getLine(2),
                this.getLine(3),
                this.getColumn(1),
                this.getColumn(2),
                this.getColumn(3),
                this.getDiagonal(),
                this.getAntiDiagonal()
        };
    }

    public String printLine(Character[] line) {
        return Arrays.stream(line)
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    public void displayToConsole() {
        Arrays.stream(boxes)
                .map(this::printLine)
                .forEach(System.out::println);
        System.out.println();
    }
}
