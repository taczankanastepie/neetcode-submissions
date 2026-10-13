class Solution {
    public int calPoints(String[] operations) {

        List<Integer> result = new ArrayList<>();

        for (String op : operations) {
            try {
                result.add(Integer.parseInt(op));
            } catch (Exception e) {
                switch(op) {
                    case "+" -> {
                        result.add(result.get(result.size() - 1) + result.get(result.size() - 2));
                    }
                    case "D" -> {
                        result.add(result.getLast() * 2);
                    }
                    case "C" -> {
                        result.removeLast();
                    }
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).sum();
    }
}