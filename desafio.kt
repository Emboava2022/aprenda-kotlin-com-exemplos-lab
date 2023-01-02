// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
	
	enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }
	
	data class Aluno(val nome: String)
	
	data class ConteudoEducacional(val nome: String, val duracao: Int = 60)
	
	data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {
	
	val inscritos = mutableListOf<Aluno>()
	
	fun matricular(aluno: Aluno) {
	    inscritos.add(aluno)
	}
	
	fun showInscritos(): MutableList<Aluno> {
	    return inscritos
	    }
	}
	
	fun main() {
	    val aluno_1 = Aluno("Pedro")
	    val aluno_2 = Aluno("André")
	    val conteudos: List<ConteudoEducacional> = listOf(ConteudoEducacional("Linguagem Kotlin"), ConteudoEducacional("Linguagem de Programação Kotlin", 60))
	    val formacao = Formacao("Programacao", Nivel.BASICO, conteudos)
	
	formacao.matricular(aluno_1)
	formacao.matricular(aluno_2)
	
	println("Alunos matriculados: ${aluno_1.nome}, ${aluno_2.nome}")
	println()
	println("Conteudos: $conteudos")
	println()
	println("Formacao: ${formacao.toString()}")
	println()
	println("Inscritos da formacao: ${formacao.showInscritos()}")
	}

