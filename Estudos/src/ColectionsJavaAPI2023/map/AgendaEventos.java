package ColectionsJavaAPI2023.map;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento(nome, atracao));
	}

	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}

	public void exibirAgenda2() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			LocalDate dataEvento = entry.getKey();
			Evento evento = entry.getValue();
			System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNomeEvento() + ", Atracao: "
					+ evento.getNomeAtracao());
		}
	}

	public void obterProximoEvento() {
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

		for (Map.Entry<LocalDate, Evento> e : eventosTreeMap.entrySet()) {
			LocalDate dataEvento = e.getKey();
			if (dataEvento.isEqual(LocalDate.now()) || dataEvento.isAfter(LocalDate.now())) {
				proximaData = dataEvento;
				proximoEvento = e.getValue();
				break;
			}

		}
		if (proximoEvento != null) {
			System.out.println(
					"O proximo evento e: " + proximoEvento.getNomeEvento() + " acontecerá na data " + proximaData);
		} else
			System.out.println("Não há eventos futuros na agenda.");
	}

	public static void main(String[] args) {
		AgendaEventos eventos = new AgendaEventos();

		eventos.adicionarEvento(LocalDate.parse("2024-05-23"), "Show Prainha", "Casaca");
		eventos.adicionarEvento(LocalDate.parse("24/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				"Show Prainha", "Macucos");
		eventos.adicionarEvento(LocalDate.parse("25/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				"Show Prainha", "Macucos");
		eventos.adicionarEvento(LocalDate.parse("28/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				"Show Prainha", "Macucos");
		eventos.adicionarEvento(LocalDate.parse("27/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				"Show Prainha", "Macucos");

		eventos.exibirAgenda();
		eventos.exibirAgenda2();
		eventos.obterProximoEvento();

	}
}
