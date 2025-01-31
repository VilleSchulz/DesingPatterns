public class SortingContext {

    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy){

        this.sortingStrategy = sortingStrategy;


    }


    public void setStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;

    }

    public boolean sort(int[] arr){
        sortingStrategy.sort(arr, 0, arr.length-1);
        return true;
    }
}
