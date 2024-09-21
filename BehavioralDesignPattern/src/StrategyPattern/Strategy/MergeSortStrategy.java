package StrategyPattern.Strategy;

// Concrete Strategies
public class MergeSortStrategy implements ISortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using Merge Sort");
    }
}
