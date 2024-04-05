(def message "Hello World")
(println message)


; Functions and 'parameters'

(defn function-name
  [param1 param2]
  ; body
  (println "function-body")
  ; the last line is returned
  (concat param1 param2)

(println (function-name "Hello" "World!"))
