import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> undoHistory; // redo history
    private List<IMemento> redoHistory; // redo history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.undoHistory = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!undoHistory.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = undoHistory.remove(undoHistory.size() - 1);
            redoHistory.add(previousState);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        undoHistory.add(currentState);
    }

    public void redo() {
        if(!redoHistory.isEmpty()){
            System.out.println("Memento found in history");
            IMemento previousState = redoHistory.remove(redoHistory.size() - 1);
            undoHistory.add(previousState);
            model.restoreState(previousState);
            gui.updateGui();

        }
    }
}
