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
  :-)

(defn my-map [f seq-1 seq-2]
  [:-])

(defn power [n k]
  :-)

(defn fib [n]
  :-)

(defn my-repeat [how-many-times what-to-repeat]
  [:-])

(defn my-range [up-to]
  [:-])

(defn tails [a-seq]
  [:-])

(defn inits [a-seq]
  [:-])

(defn rotations [a-seq]
  [:-])

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

