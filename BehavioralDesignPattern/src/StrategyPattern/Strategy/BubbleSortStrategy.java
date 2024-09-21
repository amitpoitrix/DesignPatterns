package StrategyPattern.Strategy;

// Concrete Strategies
public class BubbleSortStrategy implements ISortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using Bubble Sort");
    }
}
