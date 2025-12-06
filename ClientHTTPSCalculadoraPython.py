import requests

class CalculadoraRest:
    def __init__(self, base_url):
        self.base_url = base_url

    def calculo(self, operacao, param1, param2):
        url = f"{self.base_url}/{operacao}/{param1}/{param2}"
        response = requests.get(url)
        if response.status_code == 200:
            return response.json().get('result')
        else:
            return f"Erro: {response.status_code}, {response.text}"

    def soma(self, param1, param2, ):
        operacao = 'soma'
        return self.calculo(operacao, param1, param2)

    def subtracao(self, param1, param2):
        operacao = 'subtracao'
        return self.calculo(operacao, param1, param2)

    def multiplicacao(self, param1, param2):
        operacao = 'multiplicacao'
        return self.calculo(operacao, param1, param2)

    def divisao(self, param1, param2):
        operacao = 'divisao'
        return self.calculo(operacao, param1, param2)


if __name__ == "__main__":
    calculadora = CalculadoraRest("http://localhost:8080/operation")

    # Exemplo de uso:
    print("Soma: 10 + 5 =", calculadora.divisao(10, 5))
   