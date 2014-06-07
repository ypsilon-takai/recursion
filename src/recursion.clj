(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll)
       (product (next coll)))))

(defn singleton? [coll]
  (and (first coll)
       (empty? (next coll))))

(defn my-last [coll]
  (cond (empty? coll) nil
        (singleton? coll) (first coll)
        :t (my-last (next coll))))

(defn max-element [a-seq]
  (cond (empty? a-seq) nil
        (singleton? a-seq) (first a-seq)
        :t (let [third-and-over (next (next a-seq))]
             (max-element (cons (max (first a-seq) (second a-seq))
                                third-and-over)))))

(defn seq-max [seq-1 seq-2]
  (if (> (count seq-1) (count seq-2))
    seq-1
    seq-2))

(defn longest-sequence [a-seq]
  (cond (empty? a-seq) nil
        (singleton? a-seq) (first a-seq)
        :t (let [third-and-over (next (next a-seq))]
             (longest-sequence (cons (seq-max (first a-seq) (second a-seq))
                                     third-and-over)))))

(defn my-filter [pred? a-seq]
  (cond (empty? a-seq)
        ,,'()
        (pred? (first a-seq))
        ,,(cons (first a-seq)
                (my-filter pred? (next a-seq)))
        :t
        ,,(my-filter pred? (next a-seq))))

(defn sequence-contains? [elem a-seq]
  (cond (empty? a-seq)
        ,,false
        (== elem (first a-seq))
        ,,true
        :t
        ,,(sequence-contains? elem (next a-seq))))

(defn my-take-while [pred? a-seq]
  (cond (empty? a-seq)
        ,,'()
        (pred? (first a-seq))
        ,,(cons (first a-seq)
                (my-take-while pred? (next a-seq)))
        :t
        ,,'()))

(defn my-drop-while [pred? a-seq]
  (cond (empty? a-seq)
        ,,'()
        (pred? (first a-seq))
        ,,(my-drop-while pred? (next a-seq))
        :t
        ,,a-seq))

(defn seq= [a-seq b-seq]
  (cond (and (empty? a-seq)
             (empty? b-seq))
        ,,true
        (= (first a-seq)
            (first b-seq))
        ,,(seq= (rest a-seq)
                (rest b-seq))
        :t false))

(defn my-map [f seq-1 seq-2]
  (loop [s1 seq-1 s2 seq-2 res []]
    (if (or (empty? s1)
            (empty? s2))
      res
      (recur (rest s1) (rest s2)
             (conj res (f (first s1) (first s2)))))))

(defn power [n k]
  (if (= k 0)
    1
    (* n (power n (dec k)))))

(defn fib [n]
  (cond (= n 0) 0
        (= n 1) 1
        :t (+ (fib (- n 1))
             (fib (- n 2)))))

(defn my-repeat [how-many-times what-to-repeat]
  (if (<= how-many-times 0)
    []
    (cons what-to-repeat (my-repeat (dec how-many-times) what-to-repeat))))

(defn my-range [up-to]
  (if (<= up-to 0)
      []
      (cons (dec up-to) (my-range (dec up-to)))))

(defn tails [a-seq]
  (if (empty? a-seq)
    '(())
    (cons a-seq (tails (rest a-seq)))))

(defn inits [a-seq]
  (if (empty? a-seq)
    '(())
    (cons a-seq (inits (butlast a-seq)))))

(defn rotations 
  ([a-seq] (rotations [] a-seq))
  ([left right]
    (if (empty? right)
      []
      (cons (concat right left)
            (rotations (conj left (first right))
                       (rest right))))))

(defn rotations [a-seq]
  (map concat (tails a-seq) (reverse (inits a-seq))))

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])

