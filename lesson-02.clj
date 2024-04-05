; symbols, global and local scope, and conditionals

(defn some-function
  []
  (def global-symbol " :/ ") ; this define a global symbol
  (println global-symbol))

(some-function)
(println global-symbol) ; it is possible access a symbol defined in function scope

(defn some-function2
  []
  (let [local-symbol " :/ "]
    (println local-symbol)) ; this define a local symbol

  ; no, local-symbol is only accessible in the scope of the let function
  ; the next line fail
  ; (println local-symbol)
  nil)

(defn global-function []
  (defn local-function[] ; this is a global function
  (println "over local-function")))

(global-function)
(local-function)

(defn global-function2 []
    ; this define a local function
  (letfn [(local-function2 [] (println "in local-function"))]
  (local-function2)))
(global-function2)
; the next line fail
; (local-function2)

(let [condition (> 0 1)]
(if condition              ; if {
  (do (println "true 1")   ;   ...
   (println "true 2"))     ; }

  (do (println "false 1")  ; else {
   (println "false 2" )))) ; }

(let [user1 "notroot"
      user2 "root"]

  (defn allow? [user]
  (= user "root"))

  (if (allow? user1)
    (println user1 "allowed")
    (println user1 "forbidden"))

  (if (allow? user2)
    (println user2 "allowed")
    (println user2 "forbidden")))



