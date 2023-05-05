# Esercizio - Spring Boot - Variabili d'ambiente 2
* crea un'applicazione `Spring Boot` usando `Spring Initializr` che ha le seguenti dipendenze:
  * `Lombok`
  * `Spring Boot DevTools`
  * `Web primaverile`
* definire un file di configurazione `application.yaml` in cui si impostano 3 ambienti:
  * un ambiente chiamato `test` che gira sulla porta `4000` e che ha la proprietà `welcomeMsg` impostata su `Hello from Test`
  * un ambiente chiamato `prod` che gira sulla porta `5000` e che ha la proprietà `welcomeMsg` impostata su `Hello form Prod`
* eseguire entrambi gli ambienti, osservando la modifica del valore restituito da un controller
* ricorda di aggiungere l'opzione VM: `-Dspring.profiles.active=[inserisci_qui_nome_profilo]`

# Exercise - Spring Boot - Environment Variables 2
* create a `Spring Boot` application using `Spring Initializr` that has the following dependencies:
    * `Lombok`
    * `Spring Boot DevTools`
    * `Spring Web`
* define an `application.yaml` config file where you set 3 environments:
  * an environment called `test` that runs on the port `4000` and that has the property `welcomeMsg` set to `Hello from Test`
  * an environment called `prod` that runs on the port `5000` and that has the property `welcomeMsg` set to `Hello form Prod`
* run both the environments, observing the change of the return value by a controller
* remember to add the VM option: `-Dspring.profiles.active=[enter_here_the_profile_name]`
