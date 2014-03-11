(use 'clj-facebook-graph)
(require '(clj-facebook-graph [client :as client]))

(def facebook-auth {:access-token })

(defonce facebook-app-info 
  {:client-id 283273898488477
   :client-secret b861a2504a8a593b196c4d0744dd7956 
   :redirect-url "http://localhost:8080/facebook-callback"
   :scope ["user_friends"]})