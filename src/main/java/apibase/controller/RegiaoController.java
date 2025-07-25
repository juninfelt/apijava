package apibase.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import apibase.model.cidade;
import apibase.repository.CidadeRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class RegiaoController {
    @Autowired
    private CidadeRepository cidadeRepository;
    
    // Listar todas as cidades
    @GetMapping("/cidade")
    @ResponseStatus(HttpStatus.OK)
    public List<cidade> getAll() {
        return this.cidadeRepository.findAll();
    }
    // Criar uma nova cidade
    @PostMapping("/cidade")
    @ResponseStatus(HttpStatus.CREATED)
    public cidade createCidade(@RequestBody cidade model) {
        return this.cidadeRepository.save(model);
    }
    // Atualizar uma cidade
    @PutMapping("/cidade/{id}")
    @ResponseStatus(HttpStatus.OK)
    public cidade updateCidade(@PathVariable Long id, @RequestBody cidade model) {
        return this.cidadeRepository.save(model);
    }
    // Deletar uma cidade
    @DeleteMapping("/cidade/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCidade(@PathVariable Long id) {
        this.cidadeRepository.deleteById(id);
    }
    // Buscar uma cidade por ID
    @GetMapping("/cidade/{id}")
    @ResponseStatus(HttpStatus.OK)
    public cidade getById(@PathVariable Long id) {
        return this.cidadeRepository.findById(id).orElse(null);
    }
    // Buscar uma cidade por descrição
    @GetMapping("/cidade/descricao/{descricao}")
    @ResponseStatus(HttpStatus.OK)
    public List<cidade> getByDescricao(@PathVariable String descricao) {
        return this.cidadeRepository.findByDescricao(descricao);
    }
    // Buscar uma cidade por UF
    @GetMapping("/cidade/uf/{uf}")
    @ResponseStatus(HttpStatus.OK)
    public List<cidade> getByUf(@PathVariable String uf) {
        return this.cidadeRepository.findByUf(uf);
    }
    // Buscar uma cidade por região
    @GetMapping("/cidade/regiao/{regiao_id}")
    @ResponseStatus(HttpStatus.OK)
    public List<cidade> getByRegiao(@PathVariable Long regiaoid) {
        return this.cidadeRepository.findByRegiaoid(regiaoid);
    }
}