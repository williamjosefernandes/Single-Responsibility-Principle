# Princípio da  Responsabilidade Única (SRP) + Android + Kotlin + MVVM


O Princípio da Responsabilidade Única (SRP) é um dos princípios mais importantes da programação orientada a objetos. Ele estabelece que cada classe deve ter uma única responsabilidade, ou seja, ela deve ter apenas uma razão para mudar.

Para ilustrar este princípio, podemos utilizar a analogia do chef de cozinha. Imagine que temos uma classe Chef, que é responsável por cozinhar o prato principal, preparar a sobremesa, servir as bebidas e lavar a louça. Neste caso, a classe Chef estaria violando o princípio da responsabilidade única, pois tem várias responsabilidades.

Para resolver esse problema, podemos dividir as responsabilidades em classes separadas. Por exemplo, podemos ter uma classe Cozinheiro, que é responsável por cozinhar o prato principal e preparar a sobremesa, uma classe Garçom, que é responsável por servir as bebidas, e uma classe LavaLoucas, que é responsável por lavar a louça.
Desenvolvi exemplo de implementação deste princípio em uma aplicação Android com arquitetura MVVM em Kotlin, utilizando a analogia do chef de cozinha:

Neste projeto, temos uma classe Chef que recebe as instâncias de Cozinheiro, Garcom e LavaLoucas no construtor. A função prepararJantar() é responsável por chamar os métodos de cada classe na ordem correta.

Ao dividir as responsabilidades em classes separadas, fica mais fácil de entender e modificar o código, além de torná-lo mais organizado e reutilizável. Isso é particularmente importante em projetos maiores e complexos, onde cada classe deve ter uma única responsabilidade para facilitar a manutenção e evolução do código ao longo do tempo.

Na arquitetura MVVM, a responsabilidade única também é aplicada. Por exemplo, a classe ViewModel deve ter apenas uma responsabilidade, que é fornecer dados e comportamento para a View. Enquanto isso, a View é responsável por exibir os dados fornecidos pela ViewModel e por enviar ações de volta para a ViewModel. Essa separação clara de responsabilidades permite que cada classe se concentre em suas tarefas específicas, tornando o código mais organizado e fácil de entender e modificar.

#Em resumo#, este princípio ajuda a criar um código limpo, organizado e fácil de manter, garantindo que cada classe e método tenha uma única responsabilidade bem definida. Dessa forma, é possível reduzir o acoplamento entre as partes do sistema, o que resulta em um código mais modular e fácil de modificar. Assim, ao aplicar o princípio da responsabilidade única em seu projeto, você estará investindo em sua qualidade e garantindo que seu código seja escalável e sustentável a longo prazo.

<a href="https://www.buymeacoffee.com/williamjf"><img src="https://img.buymeacoffee.com/button-api/?text=Compre-me um café&emoji=&slug=williamjf&button_colour=FFDD00&font_colour=000000&font_family=Cookie&outline_colour=000000&coffee_colour=ffffff" /></a>
