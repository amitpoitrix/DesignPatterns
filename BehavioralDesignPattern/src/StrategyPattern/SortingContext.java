package StrategyPattern;

import StrategyPattern.Strategy.ISortingStrategy;

// Context(SortingContext)
public class SortingContext {
    private ISortingStrategy sortingStrategy;

    public SortingContext(ISortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(ISortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] arr) {
        sortingStrategy.sort(arr);
    }
}
