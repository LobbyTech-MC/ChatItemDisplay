package me.BingoRufus.RickROP;

import me.BingoRufus.RickROP.Info;
import java.util.concurrent.TimeUnit;

import org.bukkit.Bukkit;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.Note.Tone;
import org.bukkit.entity.Player;

public class RickRoll {
	private final Info info;

	public RickRoll(Info ThisPlugin) {
		info = ThisPlugin;
	}

	public static void pause(double d) {
		try {
			TimeUnit.MILLISECONDS.sleep((long) ((1000 / 20) * d));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void Play(Player playr) {
		Bukkit.getScheduler().runTaskAsynchronously(info.getThisPlugin(), new Runnable() {
			public void run() {
				Player p = playr;
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.G));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.A));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.C));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.C));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.A));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.F));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.C));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.natural(0, Tone.C));
				pause(2.666);
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.C));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.G));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.D));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.sharp(0, Tone.G));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.natural(0, Tone.C));
				pause(2.666);
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.A));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.G));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.sharp(0, Tone.G));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.D));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.natural(0, Tone.C));
				pause(2.666);
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.natural(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.C));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(1, Tone.F));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.sharp(0, Tone.G));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.natural(0, Tone.C));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.natural(0, Tone.C));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.G));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.F));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.A));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(1, Tone.F));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.C));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.sharp(0, Tone.G));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.C));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.A));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.natural(0, Tone.C));
				pause(2.666);
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(1, Tone.D));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.C));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.A));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.D));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.natural(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.sharp(0, Tone.G));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.natural(0, Tone.C));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.A));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(1, Tone.G));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));
				pause(2.666);
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.sharp(0, Tone.G));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.G));
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.D));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.natural(0, Tone.C));
				pause(2.666);
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.BASS_GUITAR, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.STICKS, Note.natural(0, Tone.D));
				pause(2.666);
				p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(0, Tone.F));
				p.playNote(p.getLocation(), Instrument.PIANO, Note.sharp(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.FLUTE, Note.sharp(0, Tone.C));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(1, Tone.E));
				p.playNote(p.getLocation(), Instrument.SNARE_DRUM, Note.natural(0, Tone.D));

			}
		});
		return;
	}
}
