class Solution{
public int numberOfPoints(List<List<Integer>> nums) {
    nums.sort(Comparator.comparing(list -> list.get(0)));

    int current = 0, numberOfPoints = 0;
    for (List<Integer> car : nums) {
      if (car.get(0) > current)
        numberOfPoints += car.get(1) - car.get(0) + 1;
      else if (car.get(1) > current)
        numberOfPoints += car.get(1) - current;

      current = Math.max(current, car.get(1));
    }

    return numberOfPoints;
}
}