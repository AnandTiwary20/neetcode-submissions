class Solution {
    public boolean isAnagram(String s, String t) {
     
     char []arr1 = s.toCharArray();
     char []arr2 = t.toCharArray();
       if(arr1.length != arr2.length ) return false;
      Map<Character,Integer> mp =new HashMap<>();

     for(int i= 0 ; i< arr1.length ;i++){
      mp.put(arr1[i] , mp.getOrDefault(arr1[i], 0) + 1);

      
     }

     for(int i= 0 ;  i<arr2.length ;i++ ){
     mp.put(arr2[i],
       mp.getOrDefault(arr2[i], 0) - 1);
     }

     for(int value : mp.values()){
      if( value != 0){
        return false;
      }
     }
   return true;
    }
}
