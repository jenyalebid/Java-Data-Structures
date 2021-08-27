public class BaseSort {

    private PrintArray printArray;
    private String sortType;

    public BaseSort(String sortType) {

        this.sortType = sortType;
    }

    public void printArray(PrintArray printArray) {
        this.printArray = printArray;
        printArray.print(sortType);
    }

//    public void getSortType(String sortType) {
//        this.sortType = sortType;
//    }
}
