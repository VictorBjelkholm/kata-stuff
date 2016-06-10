(ns kata-stuff.core
  (:gen-class))

(def list-of-things (atom '()))

(def price-map
  {"apple" 100
   "cherry" 75})

(def rebate-map
  {o
    })

(defn get-price-by-name
  [name]
  (get price-map name))

(defn sum-price-for-products
  [things]
  (reduce + (map #(get-price-by-name %1) things)))

(defn -main
  [& args]
  (swap! list-of-things concat args)
  (println (sum-price-for-products @list-of-things)))
