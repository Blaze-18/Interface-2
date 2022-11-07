public interface Sequence{
    int next();
    default int[] values (int n){
        int[] v = new int[n];

        for(int i = 0; i < n; i++)
            v[i] = next();

        return v;
    }
}