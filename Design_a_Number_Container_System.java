class NumberContainers {
    Map<Integer,Integer> m;
    Map<Integer,PriorityQueue<Integer>> d;
    public NumberContainers() {
        m = new HashMap<>();
        d = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(m.containsKey(index) && m.get(index)==number)return;
        m.put(index,number);
        d.computeIfAbsent(number,k->new PriorityQueue<>()).offer(index);
    }
    
    public int find(int number) {
        if(!d.containsKey(number)) return -1;
        PriorityQueue<Integer> pq = d.get(number);
        while(!pq.isEmpty() && m.get(pq.peek())!=number) pq.poll();
        return pq.isEmpty()? -1 : pq.peek();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */