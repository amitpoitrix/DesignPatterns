package StrategyPattern;

import StrategyPattern.Strategy.BubbleSortStrategy;
import StrategyPattern.Strategy.MergeSortStrategy;
import StrategyPattern.Strategy.QuickSortStrategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        System.out.println("Strategy Design Pattern");

        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());

        int[] arr = {4,3,6,7,1};
        sortingContext.performSort(arr);

        sortingContext.setSortingStrategy(new QuickSortStrategy());
        sortingContext.performSort(arr);

        sortingContext.setSortingStrategy(new MergeSortStrategy());
        sortingContext.performSort(arr);
    }
}
