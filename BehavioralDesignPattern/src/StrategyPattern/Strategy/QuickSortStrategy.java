package StrategyPattern.Strategy;

// Concrete Strategies
public class QuickSortStrategy implements ISortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using Quick Sort");
    }
}
