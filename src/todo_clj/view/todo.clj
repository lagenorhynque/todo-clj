(ns todo-clj.view.todo
  (:require [hiccup.form :as hf]
            [todo-clj.view.layout :as layout]))

(defn todo-index-view [req todo-list]
  (->> `([:h1 "TODO 一覧"]
         [:ul
          ~@(for [{:keys [title]} todo-list]
              [:li title])])
       (layout/common req)))

(defn todo-new-view [req]
  (->> [:section.card
        [:h2 "TODO 追加"]
        (hf/form-to
         [:post "/todo/new"]
         [:input {:name :title :placeholder "TODOを入力してください"}]
         [:button.bg-green "追加"])]
       (layout/common req)))

(defn todo-complete-view [req]
  (->> [:section.card
        [:h2 "TODOを追加しました!"]]
       (layout/common req)))
